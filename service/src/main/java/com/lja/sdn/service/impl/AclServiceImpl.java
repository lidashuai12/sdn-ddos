package com.lja.sdn.service.impl;

import com.lja.sdn.service.AclService;
import com.lja.sdn.entity.Acl;
import com.lja.sdn.mapper.AclMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lja
 * @since 2023-06-1
 */
@Service
public class AclServiceImpl extends ServiceImpl<AclMapper, Acl> implements AclService {
//
//    @Autowired
//    private AclMapper aclMapper;
//
//    @Override
//    public List<Acl> listAcl() {
//        return aclMapper.selectList(null);
//    }
//
//    @Override
//    public boolean saveAcl(Acl acl) {
//        return aclMapper.insert(acl) > 0;
//    }
//
//    @Override
//    public boolean removeAcl(int id) {
//        return aclMapper.deleteById(id) > 0;
//    }
}
