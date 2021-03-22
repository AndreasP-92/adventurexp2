INSERT INTO booking (firstname, phone, datetime, activity, paid, lastname, context,duration, mail, guests) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00,'lorenzen', 'context', 'duration', 'and@and', 6);
-- INSERT INTO booking (firstname, phone, datetime, activity, paid) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00);
-- INSERT INTO activity (activity_name, activity_avail_start, activity_avail_end, activity_min_age, activity_group_size, activity_desc, activity_pic) VALUES ('Black Death', '22-22-22', '30-30-30', '18', '10', 'Description here', '/images/events/Gokart.jpg');
-- INSERT INTO activity (activity_name, activity_avail_start, activity_avail_end, activity_min_age, activity_group_size, activity_desc, activity_pic) VALUES ('Bowling', '22-22-22', '30-30-30', '18', '10', 'Description here', '/images/events/Paintball.jpg');
INSERT INTO activity (name, starts, ends, age, size, description, pic) VALUES ('Paintball', '22-22-22', '30-30-30', '18', '10', 'Description here', '/images/events/Paintball.jpg');
--
-- INSERT INTO booking (booking_name, booking_phone, booking_datetime, booking_activity, booking_paid) VALUES ('Jeffe', 22, '1990-01-01', 'black death', 2500.00);

-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('yu', 'yu', '1234');
-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('boo', 'boo', '4321');
-- INSERT INTO profile (profile_firstname, profile_lastname, profile_phone) VALUES ('bru', 'bru', '9999');
--
-- INSERT INTO user (user_mail, user_password, user_enabled) VALUES ('dd@dd.dk', '123','1');

INSERT INTO profile (firstname, lastname, phone, mail, password, role) VALUES ('firstname', 'lastname', 22, 'and@and', 'password', 'role');
INSERT INTO auth (mail, role) VALUES ('and@and', 'ROLE_ADMIN');
INSERT INTO users (enabled, mail, password) VALUES (1, 'and@and', '123');

INSERT INTO ticket_system(context, firstname, lastname, mail, ticket_active, ticket_taken, time_stamp) VALUES ('something something', 'firstname', 'lastname', 'mail', '1', '0', '00:00:21');