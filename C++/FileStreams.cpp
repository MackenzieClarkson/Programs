#include <fstream>
#include <iostream>
#include <string>
using namespace std;
const string FILENAME = "path.dat";
int main() {
  /* Declare and initialize variables. */
  int event, previous_event = 1, task = 0, days = 0, max_days = 0,
             project_days = 0;
  ifstream path;
  /* Open data file. */
  path.open(FILENAME.c_str());
  if (path.fail()) {
    cerr << FILENAME << " failed to open.\n";
    exit(1);
  }

  /* Set up the headers before the loop. */
  cout << "Event Max Number Days for a Task \n";
  cout << "------------------------------------ \n";
  while (path >> event >> task >> days) {
    if (event == previous_event) {
      /* Count tasks for the current event. */
      if (days > max_days)
        max_days = days;
    } else { /* A new event, so we can finish up the current one */
             /* and start keeping values for the new one. */
      project_days += max_days;
      cout << previous_event << " " << max_days << endl;
      previous_event = event;
      max_days = days;
    }
  }
  /* Count the last event, and print the total project duration. */
  project_days += max_days;
  cout << event << " " << max_days << endl;
  cout << "Project duration: " << project_days << endl;
  /* Close file and exit program. */
  path.close();
  return 0;
}
