package com.inzynieria.insurance.commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShowOffers implements CommandInterface {

    private Integer idCommand;

    private String name;
    private static final Logger LOGGER = LoggerFactory.getLogger(com.inzynieria.insurance.commands.FindOffer.class);

    public ShowOffers(Integer idCommand, String name) {
        this.idCommand = idCommand;
        this.name = name;
    }

    @Override
    public Integer getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(Integer idCommand) {
        this.idCommand = idCommand;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        LOGGER.info("Wyświetlanie ofert");
        return "/show/offers";
    }
}
