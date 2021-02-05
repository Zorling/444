public abstract class Prep {

        private String name;

        public Prep(String name) {
            this.name = name;
        }

        protected abstract boolean moving(Main.Actions actions);

        public String getName() {
            return name;
        }

}
