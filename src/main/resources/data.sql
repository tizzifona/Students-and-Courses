-- Instructors
INSERT INTO instructor (id, name) VALUES (1, 'Dr. Smith');
INSERT INTO instructor (id, name) VALUES (2, 'Prof. Johnson');

-- Courses
INSERT INTO course (id, title, instructor_id) VALUES (1, 'Math 101', 1);
INSERT INTO course (id, title, instructor_id) VALUES (2, 'History 201', 2);
INSERT INTO course (id, title, instructor_id) VALUES (3, 'Physics 301', 1);

-- Students
INSERT INTO student (id, name) VALUES (1, 'Alice');
INSERT INTO student (id, name) VALUES (2, 'Bob');
INSERT INTO student (id, name) VALUES (3, 'Charlie');

-- student_course (Many-To-Many)
INSERT INTO student_course (student_id, course_id) VALUES (1, 1);
INSERT INTO student_course (student_id, course_id) VALUES (1, 2);
INSERT INTO student_course (student_id, course_id) VALUES (2, 2);
INSERT INTO student_course (student_id, course_id) VALUES (3, 3);
