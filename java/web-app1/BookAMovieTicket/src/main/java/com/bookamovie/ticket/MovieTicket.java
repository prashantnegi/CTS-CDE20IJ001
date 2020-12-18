package com.bookamovie.ticket;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MovieTicket {

    private int ticketId;
    private String movieName;
    private int screenNumber;
    private int numberOfSeats;
    private String circle;
    private LocalDate showDate;
}
