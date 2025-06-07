// ... existing code ...
package com.example.demo5.service;

import com.example.demo5.model.BookingDetails;
import com.example.demo5.repository.BookingDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingDetailsService {
    
    @Autowired
    private BookingDetailsRepository bookingDetailsRepository;
    
    public List<BookingDetails> getAllBookings() {
        return bookingDetailsRepository.findAll();
    }
    
    public Optional<BookingDetails> getBookingById(Long id) {
        return bookingDetailsRepository.findById(id);
    }
    
    public BookingDetails createBooking(BookingDetails bookingDetails) {
        return bookingDetailsRepository.save(bookingDetails);
    }
    
    public BookingDetails updateBooking(BookingDetails bookingDetails) {
        return bookingDetailsRepository.save(bookingDetails);
    }

    // ... existing code ...

    public void deleteBooking(Long id) {
        bookingDetailsRepository.deleteById(id);
    }
}