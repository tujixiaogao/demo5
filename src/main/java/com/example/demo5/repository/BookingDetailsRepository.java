// ... existing code ...
package com.example.demo5.repository;

import com.example.demo5.model.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Long> {
    // 可以在这里添加自定义查询方法
}