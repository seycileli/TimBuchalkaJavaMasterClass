package entities;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/*
* A constructor takes a theatre name with
* together with a number of rows (numRows)
* along with a number of seats per row (seatsPerRow)
* and it uses these to create seats
*
* Created the ability to reserve seats */

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%2.5s|__|", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            seats.get(foundSeat).reserve();
        } else {
            System.out.println(seatNumber.equals("X"));
            System.out.println("Seat " + seatNumber + "isn't available.");
        }

/*
        The above code is a lot more efficient than the below code

        Why? How?

        Because for 1, binarySearch is the fastest way an item in a sorted list
        It works by checking the element in the midpoint of the list
        So the method basically goes either higher or lower with the list
        So if the middle element is greater than the item that we're looking for,
        binarySearch function knows that the item we're looking for must be
        in the first part of the list.

        binarySearch will take no more than 10 checks to find an item, or decide that it is
        not present in a list of 1,024 elements.
        So over a million items, actually, 1, 045, 576 can be checked in more than 20 comparisons
        and 64 comparisons are all that's required to search for a list with an absolutely huge
        number, so 1.844 to 10th to the 19th element, so a number like
        1.844674407 x 10 (to the 10th power) <- will only take 64 comparisons

        therefore as you can see, it is much, much faster, compared to the brute forced approach
        as you can see compared to the the code below, where we were going
        each and every record, one by one.

        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber));
            requestedSeat = seat;
            break;
        }

        if (requestedSeat == null) {
            System.out.println("This seat is taken " + seatNumber);
            return false;
        }
*/
        return requestedSeat.reserve();
    }

    //for testing
    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber
                        + " has been cancelled.");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }
    }
}
