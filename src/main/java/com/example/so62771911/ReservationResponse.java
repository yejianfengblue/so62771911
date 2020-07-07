package com.example.so62771911;

public class ReservationResponse {

    private ReservationRequest reservationRequest;

    public ReservationResponse() {

    }

    public ReservationResponse(ReservationRequest reservationRequest) {
        this.reservationRequest = reservationRequest;
    }

    public ReservationRequest getReservationRequest() {
        return reservationRequest;
    }

    public void setReservationRequest(ReservationRequest reservationRequest) {
        this.reservationRequest = reservationRequest;
    }
}
