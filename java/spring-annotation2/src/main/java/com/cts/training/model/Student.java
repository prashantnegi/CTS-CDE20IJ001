package com.cts.training.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {

    private String id;
    private String name;
    private String email;

//    private Student(StudentBuilder builder){
//        this.id = builder.id;
//        this.email = builder.email;
//        this.name = builder.name;
//    }
//
//    public static class StudentBuilder{
//
//        private String id;
//
//        private String name;
//        private String email;
//
//        public StudentBuilder(String id){
//            this.id = id;
//        }
//
//        public StudentBuilder setName(String name){
//            this.name = name;
//            return this;
//        }
//
//        public StudentBuilder setEmail(String email){
//            this.email = email;
//            return this;
//        }
//
//        public Student build(){
//            return new Student(this);
//        }
//    }

}
