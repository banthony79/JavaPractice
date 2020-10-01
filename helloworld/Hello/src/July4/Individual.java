package July4;

public class Individual {

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeightincentimeters() {
            return heightincentimeters;
        }

        public void setHeightincentimeters(int heightincentimeters) {
            this.heightincentimeters = heightincentimeters;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Individual(int weight, int heightincentimeters, String name, String gender) {
            this.weight = weight;
            this.heightincentimeters = heightincentimeters;
            this.name = name;
            this.gender = gender;
        }

        int weight;
        int heightincentimeters;
        String name;
        String gender;
        ;
    }


