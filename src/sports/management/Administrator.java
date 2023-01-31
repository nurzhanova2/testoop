package sports.management;

class Administrator {
        private String username;
        private String password;

        public Administrator(String username, String password) {
            if (username == null || username.trim().length() == 0) {
                throw new IllegalArgumentException("Username cannot be null or empty");
            }
            if (password == null || password.trim().length() == 0) {
                throw new IllegalArgumentException("Password cannot be null or empty");
            }
            this.username = username;
            this.password = password;
        }

        public void addPlayer(Player player) {
            if (player == null) {
                throw new IllegalArgumentException("Player cannot be null");
            }
            // code to add a player to the system
        }

        public void editPlayer(Player player) {
            if (player == null) {
                throw new IllegalArgumentException("Player cannot be null");
            }
            // code to edit a player in the system
        }

        public void deletePlayer(Player player) {
            if (player == null) {
                throw new IllegalArgumentException("Player cannot be null");
            }
            // code to delete a player from the system
        }

        public void addEvent(Event event) {
            if (event == null) {
                throw new IllegalArgumentException("Event cannot be null");
            }
            // code to add an event to the system
        }

        public void editEvent(Event event) {
            if (event == null) {
                throw new IllegalArgumentException("Event cannot be null");
            }
            // code to edit an event in the system
        }

        public void deleteEvent(Event event) {
            if (event == null) {
                throw new IllegalArgumentException("Event cannot be null");
            }
            // code to delete an event from the system
        }

        public void addSubscriber(Subscriber subscriber) {
            if (subscriber == null) {
                throw new IllegalArgumentException("Subscriber cannot be null");
            }
            // code to add a subscriber to the system
        }

        public void editSubscriber(Subscriber subscriber) {
            if (subscriber == null) {
                throw new IllegalArgumentException("Subscriber cannot be null");
            }
            // code to edit a subscriber in the system
        }

        public void deleteSubscriber(Subscriber subscriber) {
            if (subscriber == null) {
                throw new IllegalArgumentException("Subscriber cannot be null");
            }
            // code to delete a subscriber from the system
        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
