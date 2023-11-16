package main;
import java.util.ArrayList;
import java.util.List;

public class User {

    private int userID;
    private String username;
    private String password;
    private List<User> followers;
    private List<User> following;
    private List<String> favoriteList;
    private List<String> watchList;
    private List<String> createdList;

    public User(int userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.favoriteList = new ArrayList<>();
        this.watchList = new ArrayList<>();
        this.createdList = new ArrayList<>();
    }

    public void setUserID(int userID) {
        this.userID=userID;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public boolean setPassword(String password) {
	    	boolean valid = true;
	    		
	        if (password.length()< 8 ) {
	        	System.out.println("Password must have the minimum length of 8 characters ");
	        	valid = false;
	        }
	    	if (!password.matches(".*[A-Z].*") ||       // Uppercase letter
	    	        !password.matches(".*[a-z].*") ||       // Lowercase letter
	    	        !password.matches(".*\\d.*") ||          // Digit
	    	        !password.matches(".*[!@#$%^&*()].*")) {// Special character
	    	        System.out.println("Password must contain Uppercase letter ,Lowercase letter,Digit and Special character");
	    	        valid = false;
	    	    }
	    	  
	    	if(valid = true) {
	    	this.password=password;
	       } return valid;
	    	}


    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<String> getFavoriteList() {
        return favoriteList;
    }

    public List<String> getWatchList() {
        return watchList;
    }

    public List<String> getCreatedList() {
        return createdList;
    }

    //add to favorites
    public void addFavorite(String movie) {
        favoriteList.add(movie);
    }
    //add to watch list
    public void addWatchlist(String movie) {
        watchList.add(movie);
    }
    //create a list
    public void creatList(String listName) {
        createdList.add(listName);
    }
    //delete a list
    public void deleteList(String listName) {
        createdList.remove(listName);
    }
    //follow user
    public void followUser(User user) {
        following.add(user);
        user.followers.add(this);
    } 


}
