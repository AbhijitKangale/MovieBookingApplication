INSERT INTO OAUTH_CLIENT_DETAILS (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('sapient', '{bcrypt}$2a$10$8HSv2q7oay7afGgBidhPg.CbXUTREKX6qnuFcaLdm1arEvUgPTOLy', 'http://localhost:8080/code', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

INSERT INTO PERMISSION (name) VALUES
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

INSERT INTO ROLE (name) VALUES
		('ROLE_admin'),('ROLE_normal_user');

 INSERT INTO PERMISSION_ROLE (permission_id, role_id) VALUES
     (1,1), /*create -> admin */
     (2,1), /* read -> admin */
     (3,1), /* update ->  admin */
     (4,1), /* delete -> admin */
     (2,2),  /* read -> normal user */
     (3,2);  /* update -> normal user */
INSERT INTO USER (id, username, password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'allen','{bcrypt}$2a$10$Wnyli16w55h4hhvCYTU5DO1kobN.Nu1Pn3ejDLHVgTgjQi/XUbRJa', 'allen@gmail.com', '1', '1', '1', '1');
INSERT INTO USER (id, username, password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'ben', '{bcrypt}$2a$10$nwQMT9r8iVKNXwMo9/a8h.qGBSM7YFROo076p5Tpvij.BA/n8Vite','ben@gmail.com', '1', '1', '1', '1');

INSERT INTO ROLE_USER (role_id, user_id)
    VALUES
    (1, 1) /* allen : admin user*/,
    (2, 2) /* ben : normal user */ ;