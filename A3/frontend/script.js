const apiBaseUrl = "http://localhost:8080";

async function startGame() {
    try {
        const response = await fetch(apiBaseUrl+'/start');
        const result = await response.text();
        console.log("Start Game Response:", result);
        displayMessage(result);
        document.getElementById('start').style.visibility = 'hidden';
        displayCurrentPlayer();
        displayAllPlayerDeck();
        displayAllPlayerShield();
        displayMessage("Draw a Event Card");

    } catch (error) {
        console.error("Error in startGame:", error);
    }
}

async function scenarioOne()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/startScenarioOne');
        const result = await response.text();
        await displayAllPlayerDeck();
        await displayAllPlayerShield();
        await displayCurrentPlayer();
        await displayMessage("Draw a Event Card");
    }catch (error) {
         console.error("Error in startGame:", error);
    }
}

async function A1scenario()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/A1scenario');
        const result = await response.text();
        await displayAllPlayerDeck();
        await displayAllPlayerShield();
        await displayCurrentPlayer();
        await displayMessage("Draw a Event Card");
    }catch (error) {
         console.error("Error in startGame:", error);
    }
}

async function scenarioTwo()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/startScenarioTwo');
        const result = await response.text();
        await displayAllPlayerDeck();
        await displayAllPlayerShield();
        await displayCurrentPlayer();
        await displayMessage("Draw a Event Card");
    }catch (error) {
         console.error("Error in startGame:", error);
    }
}

async function scenarioThree()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/startScenarioThree');
        const result = await response.text();
        await displayAllPlayerDeck();
        await displayAllPlayerShield();
        await displayCurrentPlayer();
        await displayMessage("Draw a Event Card");
    }catch (error) {
         console.error("Error in startGame:", error);
    }
}

async function displayCurrentPlayer()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/currentPlayer');
        result=await response.text();
        document.getElementById('Player').innerHTML="Current Player: "+result;

    }catch(error)
    {
        console.error("Error", error);
    }
}

async function displayAllPlayerDeck()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/currentPlayerDeck');
        result=await response.text();
        result=result.split("\n")
        document.getElementById('Player_1_Deck').innerHTML="Player 1 Deck: "+result[0];
        document.getElementById('Player_2_Deck').innerHTML="Player 2 Deck: "+result[1];
        document.getElementById('Player_3_Deck').innerHTML="Player 3 Deck: "+result[2];
        document.getElementById('Player_4_Deck').innerHTML="Player 4 Deck: "+result[3];

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function displayAllPlayerShield()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/allPlayerShields');
        result=await response.text();
        result=result.split(",");
        document.getElementById('Player_1_Shields').innerHTML="Player 1 Shields: "+result[0];
        document.getElementById('Player_2_Shields').innerHTML="Player 2 Shields: "+result[1];
        document.getElementById('Player_3_Shields').innerHTML="Player 3 Shields: "+result[2];
        document.getElementById('Player_4_Shields').innerHTML="Player 4 Shields: "+result[3];



    }catch(error)
    {
        console.error("Error",error);
    }
}

async function drawEventCard()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawEventCard');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function drawQ4()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawQ4');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function drawQ3()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawQ3');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function drawQ2()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawQ2');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}
async function drawPlague()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawPlague');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function drawProsperity()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawProsperity');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}

async function drawQueen()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/drawQueen');
        result=await response.text();
        document.getElementById("EventCard").innerHTML="Current EventCard: "+result;
        if(result=="Plague" || result=="Queen’s favor" ||result=="Prosperity")
        {
          await playNonQuestCard();
        }
        else
        {
          await askForSponsors(result);
        }
        displayMessage("Draw a Event Card");

    }
    catch(error)
    {
        console.error("Error",error);
    }
}



async function playNonQuestCard()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/playNonQuestCard');
        result=await response.text();
        displayMessage(result);
        displayAllPlayerDeck();
        displayAllPlayerShield();
        await trimCards();
        nextPlayer();
        sleep(5);
        displayCurrentPlayer();

    }
    catch(error)
    {

    }
}
async function askForSponsors(rounds)
{
    let i;
    let enter = document.getElementById("Enter");
    let noSponsor=true;
    for(i=0;i<4;i++)
    {
        displayMessage("Does Player "+(i+1)+" want to be a sponsor(Y/N)");
        await waitForButtonPress(enter);
        let input=document.getElementById('text').value;
        document.getElementById('text').value="";
        if(input=="Y")
        {
            try
            {
                const response = await fetch(apiBaseUrl+'/updateSponsor', {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json", // Specify JSON format
                    },
                    body: JSON.stringify(i), // Send the number
                });
                result=await response.text();
                displayMessage(result)
                noSponsor=false;
                await buildStages(rounds);
                await attack(rounds);
            }
            catch(error)
            {

            }
            break;
        }


    }
    if(noSponsor)
    {
        displayMessage("No sponsor for this quest");
        nextPlayer();
        sleep(5);
        displayCurrentPlayer();


    }
}
async function buildStages(rounds)
{
    let number = rounds.split(/[^\d]/).join("");
    number=Number(number);
    let input="";
    let button=document.getElementById("Enter");

    for(let i=0;i<number;i++)
    {
        while(true)
        {
            displayMessage("Enter index for Stage "+(1+i)+", Enter Quit to end current stage")
            await waitForButtonPress(button);
            let num=document.getElementById("text").value;
            document.getElementById('text').value="";
            input+=num;
            if(num=="Quit")
            {
                displayMessage("Moving on to next stage")
                input+=" "
                break;
            }
            input+=" "

        }
    }
    //POST request
    try
    {
        const response = await fetch(apiBaseUrl+'/buildStages', {
            method: "POST",
            headers: {
                "Content-Type": "application/json", // Specify JSON format
            },
            body: JSON.stringify(input), // Send the number
        });
        result=await response.text();
        displayMessage(result)
        displayAllPlayerDeck();

    }
    catch(error)
    {

    }


}

async function attack(rounds)
{
    let number = rounds.split(/[^\d]/).join("");
    number=Number(number);
    let button=document.getElementById("Enter");
    for(let i=0;i<number;i++)
    {

        await displayAllPlayerDeck();
        await askForParticipation();
        try
        {
            let input="";
            const response = await fetch(apiBaseUrl+'/participates');
            result=await response.text();
            let players=result.split(" ");
            if(players[0]=="")
            {
                displayMessage("No more players quest resolved")
                i=100;
                resolveQuest();
            }
            else
            {
                for(let j=0;j<players.length;j++)
                {
                    displayMessage("Player "+players[j]+" build an attack deck");
                    while(true)
                    {
                        displayMessage("Enter index for Attack Deck")
                        await waitForButtonPress(button);
                        let num=document.getElementById("text").value;
                        document.getElementById('text').value="";
                        input+=num;
                        input+="\n";
                        if(num=="Quit")
                        {
                            displayMessage("Next Player")
                            break;
                        }


                    }


                }
                await attackHelper(i,input)
                if(i==(number-1))
                {
                     displayMessage("Quest resolved")
                     resolveQuest();
                }
            }

        }
        catch(error)
        {
            console.error("Error",error);
        }

    }
}

async function resolveQuest()
{
    const response = await fetch(apiBaseUrl+'/resolveQuest')
    result=await response.text();

    nextPlayer();
    await displayAllPlayerShield();
    await displayAllPlayerDeck();
    await displayCurrentPlayer();
    await trimCards();

}

async function attackHelper(i,input)
{
   let arr=new Array(2)
   arr[0]=i;
   arr[1]=input;
   try
   {
        const response = await fetch(apiBaseUrl+'/attack', {
           method: "POST",
           headers: {
               "Content-Type": "application/json",
           },
           body: JSON.stringify(arr),
        });
        const result =await response.text()
        displayMessage(result)

   }
   catch(error)
   {
        console.error("error",error)
   }
}

async function askForParticipation()
{
    try
    {
        const response = await fetch(apiBaseUrl+'/participates');
        result=await response.text();
        let players=result.split(" ");
        console.log(players)
        let replies=new Array(players.length)
        if(players[0]!="")
        {
            for(let i=0;i<players.length;i++)
            {
                displayMessage("Would Player " +players[i]+" want to participate");
                await waitForButtonPress(document.getElementById("Enter"));
                replies[i]=document.getElementById("text").value;
                document.getElementById('text').value="";

            }
            await askForParticipationHelper(replies);
            await displayAllPlayerDeck();
            await trimCards();
        }



    }
    catch(error)
    {
        console.error("Error",error);
    }

}
async function askForParticipationHelper(replies)
{
        try
        {
        const response = await fetch(apiBaseUrl+'/postParticipation', {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(replies),
        });
        await displayAllPlayerDeck();
        await trimCards();

        }
        catch(error)
        {
            console.error("Error",error);
        }
}
async function trimCards()
{
    for(let i=0;i<4;i++)
    {
        let numOfCards=await sizeOfDeck(i);
        console.log(numOfCards);
        if(numOfCards>12)
        {
            displayMessage("Player " +(i+1)+" has too many cards, please trim")
            let arr = new Array(2);
            arr[0]=i;
            for(let j=0;j<(numOfCards-12);j++)
            {
                displayMessage("Please enter a position to get rid of card")
                await waitForButtonPress(document.getElementById("Enter"));
                let input=document.getElementById('text').value;
                document.getElementById('text').value="";
                arr[1]=input;
                console.log(arr);
                try
                {
                const response = await fetch(apiBaseUrl+'/trimCards', {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json", // Specify JSON format
                    },
                    body: JSON.stringify(arr), // Send the number
                });


                }
                catch (error)
                {
                    console.log("fail")
                }
                console.log("test");
                await displayAllPlayerDeck();


            }



        }

    }
}
async function sizeOfDeck(player)
{
    try
    {
        const response = await fetch(apiBaseUrl + '/sizeOfDeck', {
            method: 'POST',
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(player),
        });
        result=await response.text();
        return result;
    }
    catch(error)
    {

    }
}

async function nextPlayer()
{
    try
        {
            const response = await fetch(apiBaseUrl+'/nextPlayer');
            result=await response.text();

        }catch(error)
        {
            console.error("Error", error);
        }

}



function waitForButtonPress(button) {
    return new Promise((resolve) => {
        button.addEventListener("click", () => {
            resolve();
        }, { once: true });
    });
}

function displayMessage(message)
{
    document.getElementById('messages').innerHTML+="<br />"
    document.getElementById('messages').innerHTML+=message;
}

function sleep(milliseconds) {
   var currentTime = new Date().getTime();

   while (currentTime + milliseconds >= new Date().getTime()) {
   }
}
