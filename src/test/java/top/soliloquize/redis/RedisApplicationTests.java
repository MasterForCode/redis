package top.soliloquize.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Objects;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(Objects.requireNonNull(redisTemplate.getConnectionFactory()).getConnection().ping());
    }

}
