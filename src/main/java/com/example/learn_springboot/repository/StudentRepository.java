package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.StudentBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentBean, Long> {
//jpa~ <DB>와 연계되는 중계자 // JpaRepository<테이블과 동일한 자바의 형태, 테이블의 '프라이머리 키'의 타입>
}