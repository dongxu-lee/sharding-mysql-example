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
public class TestShardingDatabase {

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private PositionDetailRepository positionDetailRepository;

    @Test
    public void testAdd(){
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            //position.setId(i);
            position.setName("ldx"+i);
            position.setSalary("1000000");
            position.setCity("bj");
            positionRepository.save(position);
        }
    }

    @Test
    public void testAdd2(){
        for (int i = 1; i <= 20; i++) {
            Position position = new Position();
            //position.setId(i);
            position.setName("ldx"+i);
            position.setSalary("1000000");
            position.setCity("bj");
            positionRepository.save(position);

            PositionDetail positionDetail = new PositionDetail();
            positionDetail.setPid(position.getId());
            positionDetail.setDescription("position detail description"+i);
            positionDetailRepository.save(positionDetail);
        }
    }

}
