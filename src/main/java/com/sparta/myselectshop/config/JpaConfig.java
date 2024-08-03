package com.sparta.myselectshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing // 시간 자동 변경 가능
public class JpaConfig {
}
