# demo5

Demo5 project repository

## Project Structure

### src/main/java/com/example/demo5

#### Controller
- `BookingDetailsController.java`: Handles HTTP requests for booking operations with endpoints for create, read, update, and delete operations.

#### Model
- `BookingDetails.java`: JPA entity representing a booking with fields like id, booking number, name, dates, status, departure, destination, etc.

#### Repository
- `BookingDetailsRepository.java`: Spring Data JPA repository interface for database operations.

#### Service
- `BookingDetailsService.java`: Business logic layer handling core booking operations.

### Application Configuration
- `application.properties`: Configuration file containing database connection details and JPA settings.

## Database Schema

The application uses a MySQL database with a single table `booking_details` as defined in the provided SQL schema.