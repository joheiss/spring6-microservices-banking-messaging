package com.jovisco.services.messaging.functions;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jovisco.services.messaging.dtos.AccountsMsgDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MessageFunctions {

  @Bean
  public Function<AccountsMsgDto, AccountsMsgDto> email() {

    return accountMsgDto -> {
      log.info("Sending an email with details: " + accountMsgDto.toString());
      return accountMsgDto;
    };
  }

  @Bean
  public Function<AccountsMsgDto, Long> sms() {

    return accountMsgDto -> {
      log.info("Sending a sms with details: " + accountMsgDto.toString());
      return accountMsgDto.accountNumber();
    };
  }

}
