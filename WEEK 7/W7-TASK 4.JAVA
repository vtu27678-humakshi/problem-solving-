The browser history works like this:

Visit → goBack → goForward

For example:

google.com
     ↓
youtube.com
     ↓
facebook.com

If you go back once:

google.com ← youtube.com ← facebook.com
     ↑
   current
Simple Java Code
import java.util.*;

class BrowserHistory {

    ArrayList<String> history = new ArrayList<>();
    int current = 0;

    public BrowserHistory(String homepage) {
        history.add(homepage);
    }

    public void visit(String url) {

        // Remove forward history
        while (history.size() > current + 1) {
            history.remove(history.size() - 1);
        }

        history.add(url);
        current++;
    }

    public String back(int steps) {

        current = Math.max(0, current - steps);

        return history.get(current);
    }

    public String forward(int steps) {

        current = Math.min(history.size() - 1, current + steps);

        return history.get(current);
    }
}

INPUT

["BrowserHistory",
 "visit",
 "visit",
 "visit",
 "back",
 "back",
 "forward",
 "visit",
 "forward",
 "back",
 "back"]

["leetcode.com",
 "google.com",
 "facebook.com",
 "youtube.com",
 1,
 1,
 1,
 "linkedin.com",
 2,
 2,
 7]



Step-by-step

Start:

leetcode.com

Visit Google:

leetcode.com → google.com

Visit Facebook:

leetcode.com → google.com → facebook.com

Visit YouTube:

leetcode.com → google.com → facebook.com → youtube.com

back(1):

leetcode.com → google.com → facebook.com ← youtube.com
                                  ↑
                               current

Returns:

facebook.com

back(1):

google.com

forward(1):

facebook.com

Then visit("linkedin.com"):

leetcode.com → google.com → facebook.com → linkedin.com

Notice that youtube.com is deleted because visiting a new page after going back removes the forward history.

OUTPUT

[null,
 null,
 null,
 null,
 "facebook.com",
 "google.com",
 "facebook.com",
 null,
 "linkedin.com",
 "google.com",
 "leetcode.com"]