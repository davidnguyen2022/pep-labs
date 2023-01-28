SELECT * FROM class INNER JOIN student 
ON class.class = student.class 
WHERE class.id = student.id, class.teacher_name = "Ms. Lovelace" = student.student_name, 
class.class_title = student.student_title;