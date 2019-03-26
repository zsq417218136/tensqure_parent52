package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import util.IdWorker;

@Service
@Transactional
public class LabelService {


    @Autowired
    private LabelDao LabelDao;
    @Autowired
    private IdWorker IdWorker;


    public List<Label> findAll(){
        return LabelDao.findAll();
    }

    public Label findById(String id){
        return LabelDao.findById(id).get();
    }

    public void save(Label label){
        label.setId(IdWorker.nextId()+"");
        LabelDao.save(label);
    }

    public void update(Label label){

        LabelDao.save(label);
    }

    public void  deleteById(String id){
        LabelDao.deleteById(id);
    }

    public List<Label> findSearch(Label label) {
        return LabelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                /**
                 * root    根对象,也就是要把条件封装到哪个对象中.where 类名=label.getid
                 * query   封装查询关键字
                 * cd      用来封装条件对象的
                 */
                List<Predicate> list=new ArrayList<>();
                if (label.getLabelname()!=null&&!"".equals(label.getLabelname())){
                   Predicate predicate= cb.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");
                   list.add(predicate);

                }
                if (label.getState()!=null&&!"".equals(label.getState())){
                    Predicate predicate= cb.like(root.get("state").as(String.class),label.getState());
                    list.add(predicate);
                }
                //new一个数组最为最终返回值的条件
                Predicate[] parr=new Predicate[list.size()];
                //吧list直接转成数组
                parr=list.toArray(parr);
                return cb.and(parr);

            }
        });

    }


    public Page<Label> pageQuery(Label label, int page, int size) {
        Pageable pageable=PageRequest.of(page-1,size);
        return LabelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                /**
                 * root    根对象,也就是要把条件封装到哪个对象中.where 类名=label.getid
                 * query   封装查询关键字
                 * cd      用来封装条件对象的
                 */
                List<Predicate> list=new ArrayList<>();
                if (label.getLabelname()!=null&&!"".equals(label.getLabelname())){
                    Predicate predicate= cb.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");
                    list.add(predicate);

                }
                if (label.getState()!=null&&!"".equals(label.getState())){
                    Predicate predicate= cb.like(root.get("state").as(String.class),label.getState());
                    list.add(predicate);
                }
                //new一个数组最为最终返回值的条件
                Predicate[] parr=new Predicate[list.size()];
                //吧list直接转成数组
                parr=list.toArray(parr);
                return cb.and(parr);

            }
        },pageable);
    }
}
