package org.example.springcloud.dao;

import org.apache.ibatis.annotations.*;
import org.example.springcloud.entities.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ruanwenjun
 * @create 2020/04/19/ 12:29 PM
 */
@Mapper
@Repository
public interface PaymentDao {

    @Insert("INSERT INTO payment(serial) VALUES (#{serial})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    long createPayment(Payment payment);

    @Delete("DELETE FROM payment WHERE id = #{id}")
    int deletePaymentById(Long id);

    @Select("SELECT * FROM payment WHERE id = #{id}")
    List<Payment> getPaymentById(Long id);

    @Select("SELECT * FROM payment")
    List<Payment> getAllPayments();

    @Update("UPDATE payment set serial = #{serial} WHERE id = #{id}")
    int updatePaymentById(Payment payment);
}
