insert into author(id, first_name, last_name) values(1, 'Dan', 'Vega');
insert into post(id, title, body, author_id, posted_on) values(1, 'Spring boot is awesome', 'Blog Post content ...',1,CURRENT_DATE());
insert into post(id, title, body, author_id, posted_on) values(2, 'Spring boot Blog 2', 'Blog Post content ...',1,CURRENT_DATE());