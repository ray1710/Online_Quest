package com.quest;

import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

@RestController
@CrossOrigin(origins = "*")
public class controller {
    Game game;

    @GetMapping("/start")
    public String startGame() {
        game=new Game();
        game.distributeCards();
        game.currentPlayer=game.playerOne;
        return "Game Started, Player One Turn";
    }

    @GetMapping("/A1scenario")
    public String A1Scenario()
    {
        game=new Game();
        game.distributeCards();
        game.currentPlayer=game.playerOne;
        game.playerOne.deck.set(0,new Card("F5","Foe",5));
        game.playerOne.deck.set(1,new Card("F5","Foe",5));
        game.playerOne.deck.set(2,new Card("F15","Foe",15));
        game.playerOne.deck.set(3,new Card("F15","Foe",15));
        game.playerOne.deck.set(4,new Card("D5","Weapon",5));
        game.playerOne.deck.set(5,new Card("S10","Weapon",10));
        game.playerOne.deck.set(6,new Card("S10","Weapon",10));
        game.playerOne.deck.set(7,new Card("H10","Weapon",10));
        game.playerOne.deck.set(8,new Card("H10","Weapon",10));
        game.playerOne.deck.set(9,new Card("B15","Weapon",15));
        game.playerOne.deck.set(10,new Card("B15","Weapon",15));
        game.playerOne.deck.set(11,new Card("L20","Weapon",20));

        //P2
        game.playerTwo.deck.set(0,new Card("F5","Foe",5));
        game.playerTwo.deck.set(1,new Card("F5","Foe",5));
        game.playerTwo.deck.set(2,new Card("F15","Foe",15));
        game.playerTwo.deck.set(3,new Card("F15","Foe",15));
        game.playerTwo.deck.set(4,new Card("F40","Foe",40));
        game.playerTwo.deck.set(5,new Card("D5","Weapon",5));
        game.playerTwo.deck.set(6,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(7,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(8,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(9,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(10,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(11,new Card("E30","Weapon",40));

        //P3
        game.playerThree.deck.set(0,new Card("F5","Foe",5));
        game.playerThree.deck.set(1,new Card("F5","Foe",5));
        game.playerThree.deck.set(2,new Card("F5","Foe",5));
        game.playerThree.deck.set(3,new Card("F15","Foe",15));
        game.playerThree.deck.set(4,new Card("D5","Weapon",5));
        game.playerThree.deck.set(5,new Card("S10","Weapon",10));
        game.playerThree.deck.set(6,new Card("S10","Weapon",10));
        game.playerThree.deck.set(7,new Card("S10","Weapon",10));
        game.playerThree.deck.set(8,new Card("H10","Weapon",10));
        game.playerThree.deck.set(9,new Card("H10","Weapon",10));
        game.playerThree.deck.set(10,new Card("B15","Weapon",15));
        game.playerThree.deck.set(11,new Card("L20","Weapon",20));

        //P4
        game.playerFour.deck.set(0,new Card("F5","Foe",5));
        game.playerFour.deck.set(1,new Card("F15","Foe",15));
        game.playerFour.deck.set(2,new Card("F15","Foe",15));
        game.playerFour.deck.set(3,new Card("F40","Foe",40));
        game.playerFour.deck.set(4,new Card("D5","Weapon",5));
        game.playerFour.deck.set(5,new Card("D5","Weapon",5));
        game.playerFour.deck.set(6,new Card("S10","Weapon",10));
        game.playerFour.deck.set(7,new Card("H10","Weapon",10));
        game.playerFour.deck.set(8,new Card("H10","Weapon",10));
        game.playerFour.deck.set(9,new Card("B15","Weapon",15));
        game.playerFour.deck.set(10,new Card("L20","Weapon",20));
        game.playerFour.deck.set(11,new Card("E30","Weapon",30));

        game.adventureDeck.clear();
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        game.adventureDeck.add(new Card("L20","Weapon",20));
        return "";
    }

    @GetMapping("/startScenarioOne")
    public String startScenarioOne()
    {
        game=new Game();
        game.distributeCards();
        game.currentPlayer=game.playerOne;
        game.playerOne.deck.set(0,new Card("F5","Foe",5));
        game.playerOne.deck.set(1,new Card("F5","Foe",5));
        game.playerOne.deck.set(2,new Card("F10","Foe",10));
        game.playerOne.deck.set(3,new Card("F10","Foe",10));
        game.playerOne.deck.set(4,new Card("F15","Foe",15));
        game.playerOne.deck.set(5,new Card("F15","Foe",15));
        game.playerOne.deck.set(6,new Card("D5","Weapon",5));
        game.playerOne.deck.set(7,new Card("H10","Weapon",10));
        game.playerOne.deck.set(8,new Card("H10","Weapon",10));
        game.playerOne.deck.set(9,new Card("B15","Weapon",15));
        game.playerOne.deck.set(10,new Card("B15","Weapon",15));
        game.playerOne.deck.set(11,new Card("L20","Weapon",20));

        game.playerTwo.deck.set(0,new Card("F40","Foe",40));
        game.playerTwo.deck.set(1,new Card("F50","Foe",50));
        game.playerTwo.deck.set(2,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(3,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(4,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(5,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(6,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(7,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(8,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(9,new Card("L20","Weapon",20));
        game.playerTwo.deck.set(10,new Card("L20","Weapon",20));
        game.playerTwo.deck.set(11,new Card("E30","Weapon",30));

        game.playerThree.deck.set(0,new Card("F5","Foe",5));
        game.playerThree.deck.set(1,new Card("F5","Foe",5));
        game.playerThree.deck.set(2,new Card("F5","Foe",5));
        game.playerThree.deck.set(3,new Card("F5","Foe",5));
        game.playerThree.deck.set(4,new Card("D5","Weapon",5));
        game.playerThree.deck.set(5,new Card("D5","Weapon",5));
        game.playerThree.deck.set(6,new Card("D5","Weapon",5));
        game.playerThree.deck.set(7,new Card("H10","Weapon",10));
        game.playerThree.deck.set(8,new Card("H10","Weapon",10));
        game.playerThree.deck.set(9,new Card("H10","Weapon",10));
        game.playerThree.deck.set(10,new Card("H10","Weapon",10));
        game.playerThree.deck.set(11,new Card("H10","Weapon",10));

        game.playerFour.deck.set(0,new Card("F50","Foe",50));
        game.playerFour.deck.set(1,new Card("F70","Foe",70));
        game.playerFour.deck.set(2,new Card("H10","Weapon",10));
        game.playerFour.deck.set(3,new Card("H10","Weapon",10));
        game.playerFour.deck.set(4,new Card("S10","Weapon",10));
        game.playerFour.deck.set(5,new Card("S10","Weapon",10));
        game.playerFour.deck.set(6,new Card("S10","Weapon",10));
        game.playerFour.deck.set(7,new Card("B15","Weapon",15));
        game.playerFour.deck.set(8,new Card("B15","Weapon",15));
        game.playerFour.deck.set(9,new Card("L20","Weapon",20));
        game.playerFour.deck.set(10,new Card("L20","Weapon",20));
        game.playerFour.deck.set(11,new Card("E30","Weapon",30));

        //Rig the adventure deck
        game.adventureDeck.clear();
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F40","Foe",40));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F30","Foe",30));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("L20","Weapon",20));


        return "Game Started, Player One Turn";




    }

    @GetMapping("/startScenarioTwo")
    public String startScenarioTwo()
    {

        game=new Game();
        game.distributeCards();
        game.currentPlayer=game.playerOne;
        game.playerOne.deck.set(0,new Card("F5","Foe",5));
        game.playerOne.deck.set(1,new Card("F5","Foe",5));
        game.playerOne.deck.set(2,new Card("F10","Foe",10));
        game.playerOne.deck.set(3,new Card("F10","Foe",10));
        game.playerOne.deck.set(4,new Card("F15","Foe",15));
        game.playerOne.deck.set(5,new Card("F15","Foe",15));
        game.playerOne.deck.set(6,new Card("F20","Foe",20));
        game.playerOne.deck.set(7,new Card("F20","Foe",20));
        game.playerOne.deck.set(8,new Card("D5","Weapon",5));
        game.playerOne.deck.set(9,new Card("D5","Weapon",5));
        game.playerOne.deck.set(10,new Card("D5","Weapon",5));
        game.playerOne.deck.set(11,new Card("D5","Weapon",5));

        game.playerTwo.deck.set(0,new Card("F25","Foe",25));
        game.playerTwo.deck.set(1,new Card("F30","Foe",30));
        game.playerTwo.deck.set(2,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(3,new Card("H10","Weapon",10));
        game.playerTwo.deck.set(4,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(5,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(6,new Card("S10","Weapon",10));
        game.playerTwo.deck.set(7,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(8,new Card("B15","Weapon",15));
        game.playerTwo.deck.set(9,new Card("L20","Weapon",20));
        game.playerTwo.deck.set(10,new Card("L20","Weapon",20));
        game.playerTwo.deck.set(11,new Card("E30","Weapon",30));

        game.playerThree.deck.set(0,new Card("F25","Foe",25));
        game.playerThree.deck.set(1,new Card("F30","Foe",30));
        game.playerThree.deck.set(2,new Card("H10","Weapon",10));
        game.playerThree.deck.set(3,new Card("H10","Weapon",10));
        game.playerThree.deck.set(4,new Card("S10","Weapon",10));
        game.playerThree.deck.set(5,new Card("S10","Weapon",10));
        game.playerThree.deck.set(6,new Card("S10","Weapon",10));
        game.playerThree.deck.set(7,new Card("B15","Weapon",15));
        game.playerThree.deck.set(8,new Card("B15","Weapon",15));
        game.playerThree.deck.set(9,new Card("L20","Weapon",20));
        game.playerThree.deck.set(10,new Card("L20","Weapon",20));
        game.playerThree.deck.set(11,new Card("E30","Weapon",30));

        game.playerFour.deck.set(0,new Card("F25","Foe",25));
        game.playerFour.deck.set(1,new Card("F30","Foe",30));
        game.playerFour.deck.set(2,new Card("F70","Foe",70));
        game.playerFour.deck.set(3,new Card("H10","Weapon",10));
        game.playerFour.deck.set(4,new Card("H10","Weapon",10));
        game.playerFour.deck.set(5,new Card("S10","Weapon",10));
        game.playerFour.deck.set(6,new Card("S10","Weapon",10));
        game.playerFour.deck.set(7,new Card("S10","Weapon",10));
        game.playerFour.deck.set(8,new Card("B15","Weapon",15));
        game.playerFour.deck.set(9,new Card("B15","Weapon",25));
        game.playerFour.deck.set(10,new Card("L20","Weapon",20));
        game.playerFour.deck.set(11,new Card("L20","Weapon",20));

        //Rig the adventure deck
        game.adventureDeck.clear();
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F20","Foe",20));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("F25","Foe",25));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("F40","Foe",40));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("F30","Weapon",30));
        game.adventureDeck.add(new Card("F25","Weapon",25));
        game.adventureDeck.add(new Card("B15","Weapon",15));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("F50","Foe",50));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("F40","Weapon",40));
        game.adventureDeck.add(new Card("F50","Weapon",50));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("F35","Weapon",35));


        return "Game Started, Player One Turn";
    }
    @GetMapping("/startScenarioThree")
    public String startScenarioThree()
    {
        game=new Game();
        game.distributeCards();
        game.currentPlayer=game.playerOne;
        game.playerOne.deck.set(0,new Card("F50","Foe",50));
        game.playerOne.deck.set(1,new Card("F70","Foe",70));
        game.playerOne.deck.set(2,new Card("D5","Weapon",5));
        game.playerOne.deck.set(3,new Card("D5","Weapon",5));
        game.playerOne.deck.set(4,new Card("H10","Weapon",10));
        game.playerOne.deck.set(5,new Card("H10","Weapon",10));
        game.playerOne.deck.set(6,new Card("S10","Weapon",10));
        game.playerOne.deck.set(7,new Card("S10","Weapon",10));
        game.playerOne.deck.set(8,new Card("B15","Weapon",15));
        game.playerOne.deck.set(9,new Card("B15","Weapon",15));
        game.playerOne.deck.set(10,new Card("L20","Weapon",20));
        game.playerOne.deck.set(11,new Card("L20","Weapon",20));

        game.playerTwo.deck.set(0,new Card("F5","Foe",5));
        game.playerTwo.deck.set(1,new Card("F5","Foe",5));
        game.playerTwo.deck.set(2,new Card("F10","Foe",10));
        game.playerTwo.deck.set(3,new Card("F15","Foe",15));
        game.playerTwo.deck.set(4,new Card("F15","Foe",15));
        game.playerTwo.deck.set(5,new Card("F20","Foe",20));
        game.playerTwo.deck.set(6,new Card("F20","Foe",20));
        game.playerTwo.deck.set(7,new Card("F25","Foe",25));
        game.playerTwo.deck.set(8,new Card("F30","Foe",30));
        game.playerTwo.deck.set(9,new Card("F30","Foe",30));
        game.playerTwo.deck.set(10,new Card("F40","Foe",40));
        game.playerTwo.deck.set(11,new Card("E30","Weapon",30));

        game.playerThree.deck.set(0,new Card("F5","Foe",5));
        game.playerThree.deck.set(1,new Card("F5","Foe",5));
        game.playerThree.deck.set(2,new Card("F10","Foe",10));
        game.playerThree.deck.set(3,new Card("F15","Foe",15));
        game.playerThree.deck.set(4,new Card("F15","Foe",15));
        game.playerThree.deck.set(5,new Card("F20","Foe",20));
        game.playerThree.deck.set(6,new Card("F20","Foe",20));
        game.playerThree.deck.set(7,new Card("F25","Foe",25));
        game.playerThree.deck.set(8,new Card("F25","Foe",25));
        game.playerThree.deck.set(9,new Card("F30","Foe",30));
        game.playerThree.deck.set(10,new Card("F40","Foe",40));
        game.playerThree.deck.set(11,new Card("L20","Weapon",20));

        game.playerFour.deck.set(0,new Card("F5","Foe",5));
        game.playerFour.deck.set(1,new Card("F5","Foe",5));
        game.playerFour.deck.set(2,new Card("F10","Foe",10));
        game.playerFour.deck.set(3,new Card("F15","Foe",15));
        game.playerFour.deck.set(4,new Card("F15","Foe",15));
        game.playerFour.deck.set(5,new Card("F20","Foe",20));
        game.playerFour.deck.set(6,new Card("F20","Foe",20));
        game.playerFour.deck.set(7,new Card("F25","Foe",25));
        game.playerFour.deck.set(8,new Card("F25","Foe",25));
        game.playerFour.deck.set(9,new Card("F30","Foe",30));
        game.playerFour.deck.set(10,new Card("F50","Foe",50));
        game.playerFour.deck.set(11,new Card("E30","Weapon",30));

        game.adventureDeck.clear();
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("F5","Foe",5));
        game.adventureDeck.add(new Card("F15","Foe",15));
        game.adventureDeck.add(new Card("F10","Foe",10));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("D5","Weapon",5));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("H10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));
        game.adventureDeck.add(new Card("S10","Weapon",10));




        return "Game Started, Player One Turn";
    }

    @GetMapping("/currentPlayer")
    public String returnPlayerNum()
    {
        if(game.currentPlayer.equals(game.playerOne))
        {
            return "1";
        }
        else if(game.currentPlayer.equals(game.playerTwo))
        {
            return "2";
        }
        else if(game.currentPlayer.equals(game.playerThree))
        {
            return "3";
        }
        else if(game.currentPlayer.equals(game.playerFour))
        {
            return "4";
        }
        return "";
    }

    @GetMapping("/currentPlayerDeck")
    public String returnPlayerDeck()
    {

        String deck = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        System.setIn(in);
        try{
            game.playerOne.displayDeck();
            game.playerTwo.displayDeck();
            game.playerThree.displayDeck();
            game.playerFour.displayDeck();
            deck=outputStream.toString();
        }finally
        {
            System.setOut(originalOut);
            return deck;

        }

    }
    @GetMapping("/allPlayerShields")
    public String returnShields()
    {
        String shields="";
        if(game.playerOne.shields==7)
        {
            shields+=game.playerOne.shields+" (winner),";
        }
        else
        {
            shields+=game.playerOne.shields+",";
        }

        if(game.playerTwo.shields==7)
        {
            shields+=game.playerTwo.shields+" (winner),";
        }
        else
        {
            shields+=game.playerTwo.shields+",";
        }
        if(game.playerThree.shields==7)
        {
            shields+=game.playerThree.shields+" (winner),";
        }
        else
        {
            shields+=game.playerThree.shields+",";
        }
        if(game.playerFour.shields==7)
        {
            shields+=game.playerFour.shields+" (winner),";
        }
        else
        {
            shields+=game.playerFour.shields+",";
        }
        return shields;
        //return game.playerOne.shields+","+game.playerTwo.shields+","+game.playerThree.shields+","+game.playerFour.shields+",";
    }

    @GetMapping("/drawEventCard")
    public String drawEventCard()
    {
        InputStream sysInBackup = in;
        ByteArrayInputStream in = new ByteArrayInputStream(" ".getBytes());
        System.setIn(in);
        game.SetEventNewCard(new Scanner(in));
        System.setIn(sysInBackup);
        return game.currentEventCard.name;
    }

    @GetMapping("/drawQ4")
    public String drawQ4()
    {
        game.currentEventCard=new Card("Q4","Event",4);
        return game.currentEventCard.name;
    }

    @GetMapping("/drawQ3")
    public String drawQ3()
    {
        game.currentEventCard=new Card("Q3","Event",3);
        return game.currentEventCard.name;
    }

    @GetMapping("/drawQ2")
    public String drawQ2()
    {
        game.currentEventCard=new Card("Q2","Event",2);
        return game.currentEventCard.name;
    }

    @GetMapping("/drawPlague")
    public String drawPlague()
    {
        game.currentEventCard=new Card("Plague","Event",0);
        return game.currentEventCard.name;
    }

    @GetMapping("/drawProsperity")
    public String drawProsperity()
    {
        game.currentEventCard=new Card("Prosperity","Event",0);
        return game.currentEventCard.name;
    }
    @GetMapping("/drawQueen")
    public String drawQueen()
    {
        game.currentEventCard=new Card("Queen’s favor","Event",0);
        return game.currentEventCard.name;
    }


    @GetMapping("/playNonQuestCard")
    public String playNonQuestCard()
    {
        String name=game.currentEventCard.name;
        String message="";
        if(name.equals("Plague"))
        {
            message="Current Player loses 2 Shields";
        }
        else if(name.equals("Queen’s favor"))
        {
            message="Current Player gets 2 cards";
        }
        else if(name.equals("Prosperity"))
        {
            message="All Players gets 2 cards";
        }
        game.playEventCard();
        return message;
    }

    @GetMapping("/nextPlayer")
    public String nextPlayer()
    {
        InputStream sysInBackup = in;
        ByteArrayInputStream in = new ByteArrayInputStream(" ".getBytes());
        System.setIn(in);
        int player=0;
        if(game.currentPlayer.playerNumber==1)
        {
            player=2;
        }
        else if(game.currentPlayer.playerNumber==2)
        {
            player=3;
        }
        else if(game.currentPlayer.playerNumber==3)
        {
            player=4;
        }
        else if(game.currentPlayer.playerNumber==4)
        {
            player=1;
        }

        game.nextPlayer(player,new Scanner(in));
        System.out.println(game.currentPlayer.playerNumber);
        System.setIn(sysInBackup);
        return "";
    }

    @GetMapping("/participates")
    public String participates()
    {
        String numbers="";
        for(int i=0;i<game.eligiblePlayers.size();i++)
        {
            numbers+=game.eligiblePlayers.get(i).playerNumber;
            if(i!=game.eligiblePlayers.size()-1)
            {
                numbers+=" ";
            }
        }
        return numbers;
    }

    @GetMapping("/resolveQuest")
    public String resolveQuest()
    {
        InputStream sysInBackup = in;
        ByteArrayInputStream in = new ByteArrayInputStream(" ".getBytes());
        System.setIn(in);

        game.ResolveQuest(new Scanner(in));
        System.setIn(sysInBackup);
        return "";
    }


    @PostMapping("/sizeOfDeck")
    public String sizeOfDeck(@RequestBody int num)
    {
        if(num==0)
        {
            return String.valueOf(game.playerOne.deck.size());
        }
        else if (num==1)
        {
            return String.valueOf(game.playerTwo.deck.size());

        }
        else if (num==2)
        {
            return String.valueOf(game.playerThree.deck.size());

        }
        else if (num==3)
        {
            return String.valueOf(game.playerFour.deck.size());

        }
        return "";
    }
    @PostMapping("/updateSponsor")
    public String updateSponsor(@RequestBody int num)
    {
        if(num==0)
        {
            game.sponsor=game.playerOne;
            game.eligiblePlayers.add(game.playerTwo);
            game.eligiblePlayers.add(game.playerThree);
            game.eligiblePlayers.add(game.playerFour);
            return "Player 1 is the Sponsor of this Quest";
        }
        else if (num==1)
        {
            game.sponsor=game.playerTwo;
            game.eligiblePlayers.add(game.playerOne);
            game.eligiblePlayers.add(game.playerThree);
            game.eligiblePlayers.add(game.playerFour);
            return "Player 2 is the Sponsor of this Quest";
        }
        else if (num==2)
        {
            game.sponsor=game.playerThree;
            game.eligiblePlayers.add(game.playerOne);
            game.eligiblePlayers.add(game.playerTwo);
            game.eligiblePlayers.add(game.playerFour);
            return "Player 3 is the Sponsor of this Quest";
        }
        else if (num==3)
        {
            game.sponsor=game.playerFour;
            game.eligiblePlayers.add(game.playerTwo);
            game.eligiblePlayers.add(game.playerThree);
            game.eligiblePlayers.add(game.playerOne);
            return "Player 4 is the Sponsor of this Quest";
        }
        return "";
    }
    @PostMapping("/trimCards")
    public String trimCards(@RequestBody List<Integer> arr)
    {
        if(arr.get(0)==0)
        {
            game.playerOne.deck.remove((int) arr.get(1)-1);
        }
        else if (arr.get(0)==1)
        {
            game.playerTwo.deck.remove((int) arr.get(1)-1);

        }
        else if (arr.get(0)==2)
        {
            game.playerThree.deck.remove((int) arr.get(1)-1);

        }
        else if (arr.get(0)==3)
        {
            game.playerFour.deck.remove((int) arr.get(1)-1);

        }
        return "";
    }

    @PostMapping("/buildStages")
    public String buildStages(@RequestBody String input)
    {
        String[] inputs=input.split(" ");
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = inputs[i].replace("\"", "");
        }
        System.out.println(Arrays.toString(inputs));
        String stageInput="";
        for(int i=0;i<inputs.length;i++)
        {
            stageInput+=inputs[i];
            stageInput+="\n";
        }

        InputStream sysInBackup = in;
        ByteArrayInputStream in = new ByteArrayInputStream(stageInput.getBytes());
        System.setIn(in);

        game.SetStages(new Scanner(in));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        System.setIn(in);
        try{
            game.displayStageDeck();
        }finally
        {
            System.setOut(originalOut);
            return outputStream.toString();

        }
    }

    @PostMapping("/postParticipation")
    public String postParticipation(@RequestBody List<String> arr)
    {
        String input="";
        for(int i=0;i<arr.size();i++)
        {
            input+=arr.get(i);
            input+="\n";
        }

        InputStream sysInBackup = in;
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        System.out.println(input);

        game.askForParticipation(new Scanner(in));
        return "";

    }
    @PostMapping("/attack")
    public String attack(@RequestBody List<String> arr)
    {
        InputStream sysInBackup = in;
        System.out.println(arr.get(1));
        ByteArrayInputStream in = new ByteArrayInputStream(arr.get(1).getBytes());
        System.setIn(in);
        game.startRound(Integer.parseInt(arr.get(0)),new Scanner(in));
        String result="";
        if(game.eligiblePlayers.contains(game.playerOne))
        {
            result+="Player 1,";
        }
        if(game.eligiblePlayers.contains(game.playerTwo))
        {
            result+=" Player 2";
        }
        if(game.eligiblePlayers.contains(game.playerThree))
        {
            result+=" Player 3";
        }
        if(game.eligiblePlayers.contains(game.playerFour))
        {
            result+=" Player 4";
        }
        if(result=="")
        {
            result="No players won the last stage";
        }
        else
        {
            result+=" won the last stage";
        }
        return result;
    }









}
