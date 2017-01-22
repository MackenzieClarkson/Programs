#include <fstream>
#include <iostream>
#include <string>
using namespace std;
const string FILENAME = "path.dat";
const int MAX_DAYS = 5;
int main() {
  /* Declare variables. */
  int event, task, days;
  ifstream path;
  /* Open input file. */
  path.open(FILENAME.c_str());
  if (path.fail()) {
    cerr << FILENAME << " failed to open.\n";
    exit(1);
  }
  /* Set up the headers before the loop. */
  cout << "Tasks requiring more than " << MAX_DAYS << " days:\n";

  cout << "Event Task Days \n";
  cout << "----------------------- \n";
  /* Print tasks requiring more than MAX_DAYS days. */
  while (path >> event >> task >> days) {
    if (days > MAX_DAYS)
      cout << event << " " << task << " " << days << endl;
  }
  /* Close file and exit program. */
  path.close();
  return 0;
}
