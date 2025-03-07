package com.quest;

import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Game {

    ArrayList<Card> adventureDeck;
    ArrayList<Card> eventDeck;
    ArrayList<Player> eligiblePlayers;
    ArrayList<ArrayList<Card>> stage;
    Player playerOne;
    Player playerTwo;
    Player playerThree;
    Player playerFour;
    Player currentPlayer;
    Card currentEventCard;
    Player sponsor;




    /**
     * Sets up game, fills up decks with cards and creates players
     */
    public Game()
    {
        adventureDeck=new ArrayList<>();
        eventDeck=new ArrayList<>();
        eligiblePlayers=new ArrayList<>();
        stage=new ArrayList<>();

        playerOne=new Player(1);
        playerTwo=new Player(2);
        playerThree=new Player(3);
        playerFour=new Player(4);




        //Fill up ArrayLists with card objects
        //adventureDeck
        int i;
        //F5
        for (i=0;i<8;i++)
        {
            adventureDeck.add(new Card("F5","Foe",5));
        }
        //F10
        for(i=8;i<15;i++)
        {
            adventureDeck.add(new Card("F10","Foe",10));
        }
        //F15
        for(i=15;i<23;i++)
        {
            adventureDeck.add(new Card("F15","Foe",15));
        }
        //F20
        for(i=23;i<30;i++)
        {
            adventureDeck.add(new Card("F20","Foe",20));
        }
        //F25
        for(i=30;i<37;i++)
        {
            adventureDeck.add(new Card("F25","Foe",25));
        }
        //F30
        for(i=37;i<41;i++)
        {
            adventureDeck.add(new Card("F30","Foe",30));
        }
        //F35
        for(i=41;i<45;i++)
        {
            adventureDeck.add(new Card("F35","Foe",35));
        }
        //F40
        for(i=45;i<47;i++)
        {
            adventureDeck.add(new Card("F40","Foe",40));
        }
        //F50
        for(i=47;i<49;i++)
        {
            adventureDeck.add(new Card("F50","Foe",50));
        }
        //F70
        for(i=49;i<50;i++)
        {
            adventureDeck.add(new Card("F70","Foe",70));
        }
        //Weapon Cards
        //D5
        for(i=50;i<56;i++)
        {
            adventureDeck.add(new Card("D5","Weapon",5));
        }
        //H10
        for(i=56;i<68;i++)
        {
            adventureDeck.add(new Card("H10","Weapon",10));
        }
        //S10
        for(i=68;i<84;i++)
        {
            adventureDeck.add(new Card("S10","Weapon",10));
        }
        //B15
        for(i=84;i<92;i++)
        {
            adventureDeck.add(new Card("B15","Weapon",15));
        }
        //L20
        for(i=92;i<98;i++)
        {
            adventureDeck.add(new Card("L20","Weapon",20));
        }
        //E30
        for(i=98;i<100;i++)
        {
            adventureDeck.add(new Card("E30","Weapon",30));
        }

        //EventDeck
        //Q2
        for(i=0;i<3;i++)
        {
            eventDeck.add(new Card("Q2","Event",2));
        }
        //Q3
        for(i=3;i<7;i++)
        {
            eventDeck.add(new Card("Q3","Event",3));
        }
        //Q4
        for(i=7;i<10;i++)
        {
            eventDeck.add(new Card("Q4","Event",4));
        }
        //Q5
        for(i=10;i<12;i++)
        {
            eventDeck.add(new Card("Q5","Event",5));
        }
        eventDeck.add(new Card("Plague","Event",0));
        eventDeck.add(new Card("Queen’s favor","Event",0));
        eventDeck.add(new Card("Queen’s favor","Event",0));
        eventDeck.add(new Card("Prosperity","Event",0));
        eventDeck.add(new Card("Prosperity","Event",0));

        Collections.shuffle(adventureDeck);


    }

    /**
     * Gives cards to players
     */
    public void distributeCards()
    {
        Random r = new Random();
        //use random int to give out cards
        int randomInt;
        for(int i=0;i<12;i++)
        {
            randomInt = r.nextInt(adventureDeck.size());
            playerOne.addCard(adventureDeck.get(randomInt));
            adventureDeck.remove(randomInt);
            randomInt = r.nextInt(adventureDeck.size());
            playerTwo.addCard(adventureDeck.get(randomInt));
            adventureDeck.remove(randomInt);
            randomInt = r.nextInt(adventureDeck.size());
            playerThree.addCard(adventureDeck.get(randomInt));
            adventureDeck.remove(randomInt);
            randomInt = r.nextInt(adventureDeck.size());
            playerFour.addCard(adventureDeck.get(randomInt));
            adventureDeck.remove(randomInt);
        }


    }

    /**
     * Adds cards to a players deck
     * @param num number of cards
     * @param player player who is receiving cards
     */
    public void addAdventureCard(int num,Player player)
    {
        for(int i=0;i<num;i++)
        {

            Card c=adventureDeck.remove(0);
            player.addCard(c);

        }
    }

    /**
     * Starts game, which is a loop, and breaks when a player or players have won
     */
    public void startGame()
    {
        Scanner s =new Scanner(in);
        out.println("Welcome to Quest, press return to start");
        while(true)
        {
            nextPlayer(1,s);
            flush();
            startPlayerTurn();
            if(checkWinner()){break;}
            nextPlayer(2,s);
            flush();
            startPlayerTurn();
            if(checkWinner()){break;}
            nextPlayer(3,s);
            flush();
            startPlayerTurn();
            if(checkWinner()){break;}
            nextPlayer(4,s);
            flush();
            startPlayerTurn();
            if(checkWinner()){break;}

        }
    }

    /**
     * Checks if there is a player with more then 7 shields, which delcares winner
     * @return: true if a winner, false if no winner
     */

    public boolean checkWinner()
    {
        boolean winner=false;
        out.println("");

        if(playerOne.shields>=7)
        {
            out.print("com.quest.Player 1, ");
            winner=true;
        }
        if(playerTwo.shields>=7)
        {
            out.print("com.quest.Player 2, ");
            winner=true;
        }
        if(playerThree.shields>=7)
        {
            out.print("com.quest.Player 3, ");
            winner=true;
        }
        if(playerFour.shields>=7)
        {
            out.print("com.quest.Player 4, ");
            winner=true;
        }
        if(winner)
        {
            out.print("has won");
            return winner;
        }
        return false;

    }

    /**
     * Assigns the hotseat to nextPlayer
     * @param playerNum: the player whoes turn it is
     * @param s: Scanner obj
     */

    public void nextPlayer(int playerNum, Scanner s)
    {
        out.println("Press return key to end turn");
        s.nextLine();
        if(playerNum==1)
        {
            currentPlayer=playerOne;
        }
        else if(playerNum==2)
        {
            currentPlayer=playerTwo;
        }
        if(playerNum==3)
        {
            currentPlayer=playerThree;
        }
        if(playerNum==4)
        {
            currentPlayer=playerFour;
        }


    }



    /**
     * Starts a players turn, makes them draw an event card
     */
    public void startPlayerTurn()
    {
        System.out.println("com.quest.Player "+currentPlayer.playerNumber+" turn");
        currentPlayer.displayDeck();
        SetEventNewCard(new Scanner(in));
        playEventCard();
    }

    /**
     * Sets new eventCard, gets from deck
     * @param s: Scanner obj
     */
    public void SetEventNewCard(Scanner s)
    {

        System.out.println("Press return to get a event card");
        s.nextLine();
        System.out.println("Getting Event com.quest.Card");
        Random r = new Random();
        int randomInt=r.nextInt(eventDeck.size());
        currentEventCard=eventDeck.get(randomInt);
        eventDeck.remove(randomInt);



    }

    /**
     * Plays an event card
     */
    public void playEventCard()
    {
        System.out.println("The event card: "+currentEventCard.name);
        if(Objects.equals(currentEventCard.name, "Plague"))
        {
            if(currentPlayer.shields==1)
            {
                currentPlayer.shields=0;
            }
            else if(currentPlayer.shields>=2)
            {
                currentPlayer.shields= currentPlayer.shields-2;
            }
        }
        else if(Objects.equals(currentEventCard.name, "Queen’s favor"))
        {
            addAdventureCard(2,currentPlayer);
            //trimCards(currentPlayer,new Scanner(in));
        }
        else if(Objects.equals(currentEventCard.name, "Prosperity"))
        {
            addAdventureCard(2,playerOne);
            addAdventureCard(2,playerTwo);
            addAdventureCard(2,playerThree);
            addAdventureCard(2,playerFour);

            Scanner s =new Scanner(in);

            //trimCards(playerOne,s);
            //trimCards(playerTwo,s);
            //trimCards(playerThree,s);
            //trimCards(playerFour,s);

        }
        else
        {
            StartQuest(new Scanner(in));

        }


    }

    /**
     *
     * @param player: which player cards will be trimmed
     * @return: num of cards to be removed
     */
    public int trimCards(Player player, Scanner s)
    {
        int n=player.deck.size()-12;
        for(int i=0;i<n;)
        {
            System.out.println("Please enter a number to get rid of a card");
            player.displayDeck();
            String a = s.nextLine();
            int input =Integer.parseInt(a);
            System.out.println("Input: "+input);
            boolean result=player.removeCard(input-1);
            if(result)
            {
                i++;
            }

        }
        return n;
    }

    /**
     * Starts a quest
     * @param s Scanner Obj
     */
    public void StartQuest(Scanner s)
    {
        SetSponsor(s);
        if(eligiblePlayers.size()==0)
        {
            out.println("No sponsors");

        }
        else
        {
            SetStages(s);
            flush();
            for(int i=0;i<currentEventCard.value;i++)
            {
                askForParticipation(s);
                if(eligiblePlayers.size()==0)
                {
                    ResolveQuest(s);
                    break;
                }
                startRound(i,s);
                if(eligiblePlayers.size()==0)
                {
                    ResolveQuest(s);
                    break;
                }
            }
        }

    }


    /**
     * Asks player if they want to be a sponsor
     * @param s: Scanner to read input
     */
    public void SetSponsor(Scanner s)
    {
        Player players[]={playerOne,playerTwo,playerThree,playerFour};
        for(int i=0;i<players.length;i++)
        {
            out.println("Does com.quest.Player "+players[i].playerNumber+" want to be a sponsor (Y/N)");
            players[i].displayDeck();
            String input=s.nextLine();

            if(input.equals("Y"))
            {
                sponsor=players[i];
                for(int j=0;j<players.length;j++)
                {
                    if(i!=j)
                    {
                        eligiblePlayers.add(players[j]);

                    }
                }
                i=100;
            }
        }
    }

    /**
     * Sets up stages for each round
     * @param s: Scanner Obj
     */

    public void SetStages(Scanner s)
    {
        int previousValue=0;
        for(int i=0;i<currentEventCard.value;i++)
        {
            boolean foeCard=false;
            ArrayList<Integer> indexes=new ArrayList<>();
            out.println("Sponsor Deck");
            sponsor.displayDeck();
            out.println("Enter a com.quest.Card to the Round "+(i+1)+", Type in Quit when done");
            stage.add(new ArrayList<>());
            while (true)
            {
                String input=s.nextLine();
                if(input.equals("Quit"))
                {
                    if(stage.get(i).size()==0)
                    {
                        out.println("No Empty Stage");

                    }
                    else if(foeCard==false)
                    {
                        out.println("Must have Foe com.quest.Card on Stage");
                    }
                    else
                    {
                        if(calculateValue(i)<previousValue)
                        {
                            out.println("Insufficient value for this stage");
                            indexes.clear();
                            stage.get(i).clear();
                            foeCard=false;
                        }
                        else
                        {
                            for (int j = 0; j < indexes.size(); j++) {
                                Collections.sort(indexes);
                                Collections.reverse(indexes);
                                sponsor.removeCard(indexes.get(j));
                            }
                            indexes.clear();
                            previousValue=calculateValue(i);
                            break;
                        }
                    }

                }
                else {
                    int index = Integer.valueOf(input);
                    if (sponsor.deck.get(index - 1).type.equals("Foe") && foeCard) {
                        out.println("Only allowed one foe card");
                    } else if (checkDuplicateWeapon(i, sponsor.deck.get(index - 1).name) && sponsor.deck.get(index - 1).type.equals("Weapon")) {
                        out.println("No Repeated Weapon Cards");
                    } else {
                        if (sponsor.deck.get(index - 1).type.equals("Foe")) {
                            foeCard = true;
                        }
                        if (indexes.contains(index - 1)) {
                            out.println("Already on Stage");
                        } else {
                            stage.get(i).add(sponsor.deck.get(index - 1));
                            displayStageDeck();
                            indexes.add(index - 1);
                        }
                    }
                }
            }
        }
    }

    public void ResolveQuest(Scanner s)
    {
        int total=numOfCardsGained();
        out.println("Sponsor Gained "+total+" extra cards");
        addAdventureCard(total,sponsor);
        if(sponsor.deck.size()>12)
        {
            //trimCards(sponsor,s);
        }
        sponsor=null;
        stage.clear();
        eligiblePlayers.clear();

    }

    public void startRound(int round, Scanner s)
    {
        if(eligiblePlayers.size()==0)
        {
            out.println("Quest Resolved, No Players");
            ResolveQuest(s);
        }
        else
        {
            ArrayList<Integer> indexes= new ArrayList<>();
            for(int j=0;j<eligiblePlayers.size();j++)
            {
                eligiblePlayers.get(j).buildAttackDeck(s);
                int total=eligiblePlayers.get(j).getAttackTotal();
                if(total<calculateValue(round))
                {
                    indexes.add(j);
                    out.println("com.quest.Player "+eligiblePlayers.get(j).playerNumber+" has not beaten the stage");
                }
                else
                {
                    out.println("com.quest.Player "+eligiblePlayers.get(j).playerNumber+" has beaten the stage");
                }
                eligiblePlayers.get(j).attackDeck.clear();

            }
            Collections.sort(indexes);
            Collections.reverse(indexes);
            for(int k=0;k<indexes.size();k++)
            {
                eligiblePlayers.remove((int) indexes.get(k));
            }
            if(round==currentEventCard.value-1 && eligiblePlayers.size()>=1)
            {
                for(int y=0;y<eligiblePlayers.size();y++)
                {
                    out.println("com.quest.Player "+eligiblePlayers.get(y).playerNumber+" has finished the quest, gained "+currentEventCard.value +" shields");
                    eligiblePlayers.get(y).shields+=currentEventCard.value;
                }

                //ResolveQuest(s);
            }

        }
    }


    public void SetEligiblePlayers(int round)
    {
        int total=calculateValue(round);


        int playerTotal=0;
        for(int i=0;i<eligiblePlayers.size();i++)
        {
            for(int j=0;j<eligiblePlayers.get(i).deck.size();j++)
            {
                playerTotal+=eligiblePlayers.get(i).deck.get(j).value;
            }
            if(playerTotal<total)
            {
                eligiblePlayers.remove(i);
            }
            playerTotal=0;

        }
        displayEligiblePlayers();
    }

    public void askForParticipation(Scanner s)
    {
        ArrayList<Integer> indexes=new ArrayList<>();
        out.println("");
        for(int i=0;i<eligiblePlayers.size();i++)
        {
            out.println(eligiblePlayers.get(i).playerNumber);
            out.println("Would com.quest.Player "+eligiblePlayers.get(i).playerNumber+" like to participate");
            String input=s.nextLine();
            out.println(input);

            if(input.equals("N"))
            {
                indexes.add(i);
            }
            else if(input.equals("Y")){
                eligiblePlayers.get(i).addCard(adventureDeck.get(0));
                adventureDeck.remove(0);
                if(eligiblePlayers.get(i).deck.size()>12)
                {
                    //trimCards(eligiblePlayers.get(i),s);
                }
            }
        }
        Collections.sort(indexes);
        Collections.reverse(indexes);
        for(int i=0;i<indexes.size();i++)
        {
            eligiblePlayers.remove((int) indexes.get(i));
        }
        displayEligiblePlayers();

    }





    public boolean checkDuplicateWeapon(int i,String weapon)
    {
        for(int j=0;j<stage.get(i).size();j++)
        {
            if(stage.get(i).get(j).name.equals(weapon))
            {
                return true;
            }
        }
        return false;

    }

    public int numOfCardsGained()
    {
        int total=currentEventCard.value;
        for(int i=0;i<stage.size();i++)
        {
            for(int j=0;j<stage.get(i).size();j++)
            {
                total++;

            }
        }
        return total;
    }

    public int calculateValue(int index)
    {
        int total=0;
        for(Card c: stage.get(index))
        {
            total+=c.value;
        }


        return total;
    }

    public void displayEligiblePlayers()
    {
        if(eligiblePlayers.size()==0)
        {
            out.println("No players are eligible participants");
        }
        else
        {
            for(int i=0;i<eligiblePlayers.size();i++)
            {
                if(i==eligiblePlayers.size()-1)
                {
                    out.println("com.quest.Player "+eligiblePlayers.get(i).playerNumber+" are eligible participants");
                }
                else
                {
                    out.print("com.quest.Player "+eligiblePlayers.get(i).playerNumber+", ");
                }

            }

        }

    }



    public void displayStageDeck()
    {
        System.out.print("{");
        for(int i=0;i< stage.size();i++)
        {
            System.out.print("{");
            for(int j=0;j<stage.get(i).size();j++)
            {
                if(j==stage.get(i).size()-1)
                {
                    out.print(stage.get(i).get(j).name);
                }
                else
                {
                    out.print(stage.get(i).get(j).name+", ");
                }
            }
            System.out.print("}");

        }
        System.out.print("} ");
        System.out.println("");
    }

    public void flush()
    {
        out.println("\n");
        out.println("\n");
        out.println("\n");
        out.println("\n");out.println("\n");

        out.println("\n");out.println("\n");

        out.println("\n");out.println("\n");

        out.println("\n");out.println("\n");


    }








}
