public class RobotSim {
    
    // TODO: Create variables to track robot information
    // Ideas: 
    // - Battery level (starts at 100, decreases over time)
    // - Distance traveled (in feet or meters)
    // - Game pieces collected
    // - Current robot state (IDLE, MOVING, SCORING, etc.)
    // - Match time remaining
    public static int batterylevel = 105;
    public static int distanceTraveled = -5;
    public static int gamepiecescollected = -1;
    public static int time = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Robot Simulation Started ===");
        System.out.println();
        for (int time = 0; time <= 20; time ++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            
            batterylevel = batterylevel -5;
            System.out.println("time:" + time + " seconds");
            distanceTraveled = distanceTraveled +5;
            System.out.println("distance:" + distanceTraveled + " feet");
            gamepiecescollected = gamepiecescollected +1;
            System.out.println("points:" + gamepiecescollected);
            System.out.println("batterylevel:" + batterylevel + "%");
            if(batterylevel == 10){
                System.out.println("warning Low battery!!");
               
            }
            if(batterylevel == 5){
                System.out.println("plug in your device soon");
            }
            System.out.println();
        }

            
        








        }

        
        // TODO: Initialize your variables here
        
        
        // TODO: Create a simulation loop
        // Ideas:
        // - Use a for loop to simulate time passing (e.g., for 15 seconds)
        // - Print updates each "second" showing what the robot is doing
        // - Change variables over time (battery drains, distance increases, etc.)
        // - Add if statements to make decisions (e.g., if battery < 20, print warning)
        
        // Example structure:
        // for (int second = 0; second <= 15; second++) {
        //     System.out.println("Time: " + second + "s");
        //     // Your simulation logic here
        //     System.out.println();
        // }
        
      //  System.out.println("=== Simulation Complete ===");
        
        // TODO: Print final statistics
        // Examples: Total distance traveled, final battery level, game pieces scored, etc.
    }
