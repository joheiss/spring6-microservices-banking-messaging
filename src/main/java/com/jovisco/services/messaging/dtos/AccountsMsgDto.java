package com.jovisco.services.messaging.dtos;

/**
 * @param accoutNumber
 * @param name
 * @param email
 * @param mobileNumber
 */
public record AccountsMsgDto(
    Long accountNumber, String name, String email, String mobileNumber) {

}
