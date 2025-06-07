// ... existing code ...
package com.example.demo5.controller;

import com.example.demo5.model.BookingDetails;
import com.example.demo5.service.BookingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flight")
public class BookingDetailsController {
    
    @Autowired
    private BookingDetailsService bookingDetailsService;
    
    @GetMapping("/bookings")
    public ResponseEntity<List<BookingDetails>> getAllBookings() {
        List<BookingDetails> bookings = bookingDetailsService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
    
    @GetMapping("/bookings/{id}")
    public ResponseEntity<BookingDetails> getBookingById(@PathVariable Long id) {
        Optional<BookingDetails> booking = bookingDetailsService.getBookingById(id);
        BookingDetails getBooking = bookingDetailsService.updateBooking(booking.orElse(null));
        return new ResponseEntity<>(getBooking, HttpStatus.OK);
    }

    // ... existing code ...
    
    @PostMapping("/createBooking")
    public ResponseEntity<BookingDetails> createBooking(@RequestBody BookingDetails bookingDetails) {
        BookingDetails createdBooking = bookingDetailsService.createBooking(bookingDetails);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }
    
    @PostMapping("/updateBooking")
    public ResponseEntity<BookingDetails> updateBooking( @RequestBody BookingDetails bookingDetails) {
        Optional<BookingDetails> bookingById = bookingDetailsService.getBookingById(bookingDetails.getId());
        bookingDetails.setUpdateVersion(bookingById.get().getUpdateVersion() + 1);
        BookingDetails updatedBooking = bookingDetailsService.updateBooking(bookingDetails);
        return new ResponseEntity<>(updatedBooking, HttpStatus.OK);
    }

    // ... existing code ...

    @DeleteMapping("/deleteBooking/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        bookingDetailsService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}