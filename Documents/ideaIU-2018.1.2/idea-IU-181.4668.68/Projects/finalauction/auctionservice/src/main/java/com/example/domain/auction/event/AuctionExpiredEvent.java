package com.example.domain.auction.event;

import com.example.domain.auction.Auction;
import org.springframework.context.ApplicationEvent;

public class AuctionExpiredEvent extends ApplicationEvent {
    public AuctionExpiredEvent(Auction source) {
        super(source);
    }

    @Override
    public Auction getSource(){
        return (Auction)source;
    }
}
