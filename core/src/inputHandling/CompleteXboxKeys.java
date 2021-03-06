/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputHandling;
import com.badlogic.gdx.utils.SharedLibraryLoader;
/**
 *
 * @author qubasa
 */
public class CompleteXboxKeys 
{
    // Buttons
public static final int A;
public static final int B;
public static final int X;
public static final int Y;
public static final int GUIDE;
public static final int L_BUMPER;
public static final int R_BUMPER;
public static final int BACK;
public static final int START;
public static final int DPAD_UP;
public static final int DPAD_DOWN;
public static final int DPAD_LEFT;
public static final int DPAD_RIGHT;

// Axes
/** left trigger, -1 if not pressed, 1 if pressed **/
public static final int L_TRIGGER;
/** right trigger, -1 if not pressed, 1 if pressed **/
public static final int R_TRIGGER;
/** left stick vertical axis, -1 if up, 1 if down **/
public static final int L_STICK_VERTICAL_AXIS;
/** left stick horizontal axis, -1 if left, 1 if right **/
public static final int L_STICK_HORIZONTAL_AXIS;
/** right stick vertical axis, -1 if up, 1 if down **/
public static final int R_STICK_VERTICAL_AXIS;
/** right stick horizontal axis, -1 if left, 1 if right **/
public static final int R_STICK_HORIZONTAL_AXIS;

static {
        if (SharedLibraryLoader.isWindows) {
                A = 0;
                B = 1;
                X = 2;
                Y = 3;
                GUIDE = -1;
                L_BUMPER = 4;
                R_BUMPER = 5;
                BACK = 6;
                START = 7;
                DPAD_UP = -1;
                DPAD_DOWN = -1;
                DPAD_LEFT = -1;
                DPAD_RIGHT = -1;
                L_TRIGGER = 4;
                R_TRIGGER = 4;
                L_STICK_VERTICAL_AXIS = -1;
                L_STICK_HORIZONTAL_AXIS = -1;
                R_STICK_VERTICAL_AXIS = -1;
                R_STICK_HORIZONTAL_AXIS = -1;
        } else if (SharedLibraryLoader.isLinux) {
                A = 0;
                B = 1;
                X = 2;
                Y = 3;
                GUIDE = 8;
                L_BUMPER = 4;
                R_BUMPER = 5;
                BACK = 6;
                START = 7;
                DPAD_UP = 13;
                DPAD_DOWN = 14;
                DPAD_LEFT = 11;
                DPAD_RIGHT = 12;
                L_TRIGGER = 2;
                R_TRIGGER = 5;
                L_STICK_VERTICAL_AXIS = 0;
                L_STICK_HORIZONTAL_AXIS = 1;
                R_STICK_VERTICAL_AXIS = 3;
                R_STICK_HORIZONTAL_AXIS = 4;
        } else if (SharedLibraryLoader.isMac) {
                A = 11;
                B = 12;
                X = 13;
                Y = 14;
                GUIDE = 10;
                L_BUMPER = 8;
                R_BUMPER = 9;
                BACK = 5;
                START = 4;
                DPAD_UP = 0;
                DPAD_DOWN = 1;
                DPAD_LEFT = 2;
                DPAD_RIGHT = 3;
                L_TRIGGER = 0;
                R_TRIGGER = 1;
                L_STICK_VERTICAL_AXIS = 3;
                L_STICK_HORIZONTAL_AXIS = 2;
                R_STICK_VERTICAL_AXIS = 5;
                R_STICK_HORIZONTAL_AXIS = 4;
        } else {
                A = -1;
                B = -1;
                X = -1;
                Y = -1;
                GUIDE = -1;
                L_BUMPER = -1;
                R_BUMPER = -1;
                L_TRIGGER = -1;
                R_TRIGGER = -1;
                BACK = -1;
                START = -1;
                DPAD_UP = -1;
                DPAD_DOWN = -1;
                DPAD_LEFT = -1;
                DPAD_RIGHT = -1;
                L_STICK_VERTICAL_AXIS = -1;
                L_STICK_HORIZONTAL_AXIS = -1;
                R_STICK_VERTICAL_AXIS = -1;
                R_STICK_HORIZONTAL_AXIS = -1;
        }
}
}
