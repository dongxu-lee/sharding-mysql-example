package dao;

import com.ldx.Application;
import com.ldx.entity.Position;
import com.ldx.entity.PositionDetail;
import com.ldx.repository.PositionDetailRepository;
import com.ldx.repository.PositionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMasterSlave {


    //写操作只写入主库，从库中没有数据

    //读操作读取从库，从库里没有数据，所以读不出数据

    //可以配合分库分表，比如使用广播表，让主从库里都有数据

}
