package com.messenger.miracle.com.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.messenger.miracle.com.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}

