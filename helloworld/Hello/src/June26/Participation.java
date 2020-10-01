package June26;

import java.util.Arrays;


import java.util.Scanner;

public class Participation {

        private int photoId;
        private char sex;
        private boolean hasJob;
        private int salary;

        public Participation(int photoId, char sex, boolean hasJob, int salary) {
            this.photoId = photoId;
            this.sex = sex;
            this.hasJob = hasJob;
            this.salary = salary;
        }

        public int getPhotoId() {
            return photoId;
        }

        public char getSex() {
            return sex;
        }

        public boolean isHasJob() {
            return hasJob;
        }

        public void setPhotoId(int photoId) {
            this.photoId = photoId;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public void setHasJob(boolean hasJob) {
            this.hasJob = hasJob;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }


    }



