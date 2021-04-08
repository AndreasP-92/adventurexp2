INSERT INTO booking (firstname, phone, datetime, activity, paid, lastname, context,duration, mail, guests, booking_active, booking_closed) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00,'lorenzen', 'context', 'duration', 'and@and', 6, 0, 1);
INSERT INTO booking (firstname, phone, datetime, activity, paid, lastname, context,duration, mail, guests, booking_active, booking_closed) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00,'lorenzen', 'context', 'duration', 'and@and', 6, 1, 0);

INSERT INTO booking (firstname, phone, datetime, activity, paid, lastname, context,duration, mail, guests, booking_active, booking_closed) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00,'lorenzen', 'context', 'duration', 'and@and', 6, 0, 1);

INSERT INTO activity (name, starts, ends, age, size, description, pic, price, practicalinfo, subheading) VALUES ('Bowling', '2021-01-23', '2021-06-01', '8', '10', 'Bowlernes Bowling Center råder over 20 velholdte bowlingbaner. Alle baner er udstyret med “børnebander”, hvilket giver børnene mulighed for at slå sig løs og nyde oplevelsen uden at skulle se kuglen trille i renden hver gang. Max. 6 personer pr. bane. En banetime er 57 min. Kom gerne i god tid. Aldersgrænse fredag-lørdag efter kl. 21.00 er 18 år (eller børn ifølge med forældre).', '/images/events/bowling-1180288-1600x1200.jpg', 1500.00, '1 bowlingbane i 2 timer!
Skoleje for op til 6 personer! (spil op til 6 personer pr.bane)
6 stk. drinkskuponer á 65,-kr stykket! (til cocktails á 65,-kr)
1 stor kurv med lækre popcorn!', 'Vi Tager Kegler');
INSERT INTO activity (name, starts, ends, age, size, description, pic, price, practicalinfo, subheading) VALUES ('Black Death', '2021-03-23', '2021-06-01', '18', '12', 'Devolution-Z et moderne zombierollespil med et simpelt mål: Du skal overleve. Måden du overlever på, er op til dig. Men hvis du først er død og blevet til en zombie er din eneste opgave at dræbe og smitte de andre overlevere.

Devolution Z er ikke for sarte sjæle. Alt fra indtjek af er nemlig in-game til spillets afslutning. Det vil sige at du i teorien kan nå at dø inden for de første 5 min. Alle ting du finder, må du tage med dig eller rykke rundt på. Finder du en bunke dæk? Ja, så er det op til dig hvad du gør med dem. Du kan kravle på bygninger eller i træer så længe du ikke ødelægger dem.

Hver person starter med begrænset udstyr. Det vil sige at der allerede fra start af, vil være mangel på for eksempel ammunition, mad og våben. Mad er inkluderet i prisen, men man får det kun udleveret, hvis man er i stand til at finde, eller stjæle det. Der vil dog være mad til alle som bliver til en zombie under spillet.', '/images/events/zombies.jpg', 1500.00, 'Spillet foregår i AdventureParks fantastiske område. 80.000m2 med skov, slette, åer, bakker, huse, ruiner og meget mere, inviterer til oplevelser du sent vil glemme.', 'Træd ind i en Zombiefilm...');
INSERT INTO activity (name, starts, ends, age, size, description, pic, price, practicalinfo, subheading) VALUES ('Paintball', '2021-01-23', '2021-04-01', '16', '16', 'Her kan I slippe jeres indre snigskytter løs og nedlægge venner og kolleger på mere end 6000 actionfyldte kvadratmeter. Altid på jeres helt egen paintballbane – og med en personlig oplevelsesvært, som hjælper og vejleder jer hele vejen igennem.

I kan tilrettelægge kampene, nøjagtigt som I vil. Når først slaget går i gang, er der nemlig flere mulige spilformer at vælge imellem.

Vi leverer alt udstyret – fra camouflagedragt til effektive og præcise paintballgeværer.

Vær opmærksom på at man som min. skal være fyldt 16 år for at spille paintball. Deltagere der ikke er fyldt 18 skal medbringe skriftligt forældretilladelse.', '/images/events/Paintball.jpg', 1500.00, 'Medbring egen heldragt', 'Headshot');

INSERT INTO duration (activity_name, duration) VALUES ('Bowling', 1);
INSERT INTO duration (activity_name, duration) VALUES ('Bowling', 2);
INSERT INTO duration (activity_name, duration) VALUES ('Black Death', 12);
INSERT INTO duration (activity_name, duration) VALUES ('Black Death', 24);
INSERT INTO duration (activity_name, duration) VALUES ('Black Death', 48);
INSERT INTO duration (activity_name, duration) VALUES ('Black Death', 1);
INSERT INTO duration (activity_name, duration) VALUES ('Black Death', 2);
INSERT INTO duration (activity_name, duration) VALUES ('Paintball', 2);
INSERT INTO duration (activity_name, duration) VALUES ('Paintball', 1);


INSERT INTO schedule (mail,activity, starts, ends) VALUES('admin@adventurexp.com', 'Bowling', '2021-03-26', '2021-03-27');
INSERT INTO schedule (mail, activity, starts, ends) VALUES('admin@adventurexp.com', 'Paintball','2021-03-28', '2021-03-28');

-- INSERT INTO booking (booking_name, booking_phone, booking_datetime, booking_activity, booking_paid) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00);

-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('yu', 'yu', '1234');
-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('boo', 'boo', '4321');
-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('bru', 'bru', '9999');
--
-- INSERT INTO user (user_mail, user_password, user_enabled) VALUES ('dd@dd.dk', '123','1');

INSERT INTO profile (firstname, lastname, phone, mail, password, role) VALUES ('Admin', 'Admin', 22, 'admin@adventurexp.com', '123', 'ROLE_ADMIN');
INSERT INTO auth (mail, role) VALUES ('admin@adventurexp.com', 'ROLE_ADMIN');
INSERT INTO users (enabled, mail, password, role) VALUES (1, 'admin@adventurexp.com', '123', 'ROLE_ADMIN');

INSERT INTO ticket_system(context, firstname, lastname, mail, ticket_active, ticket_taken, time_stamp) VALUES ('something something', 'Admin', 'Admin', 'admin@adventurexp.com', '1', '0', '00:00:21');
-- INSERT INTO duration(duration) VALUES (12);
-- INSERT INTO duration(duration) VALUES (24);
-- INSERT INTO duration(duration) VALUES (48);