#include <cstdlib>
#include <fstream>
#include <iostream>
using namespace std;
const int MAX_INDEX = 20;
double interpolate(double, int x[], double y[]);
int main() {
  /* Define variables and function prototypes. */
  int index = 0, angle[MAX_INDEX];
  double coef[MAX_INDEX], request;
  ifstream tunnel;
  /* Open input file. */
  tunnel.open("tunnel.txt");
  if (tunnel.fail()) {
    cerr << "tunnel.dat failed to open.\n";
    exit(1);
  }
  /* Read data. */
  while ((tunnel >> angle[index] >> coef[index]) && !tunnel.eof())
    index++;
  /* Tell user the range of angles. */
  cout << "Angles range from " << angle[0] << " to " << angle[index - 1]
       << endl;
  /* Prompt user for input. */
  cout << "Enter angle: ";
  cin >> request;
  /* Interpolate the coefficent of lift, if angle in range. */
  if ((request < angle[0]) || (request > angle[index - 1]))
    cout << "Angle out of range , cannot interpolate." << endl;
  else
    cout << "Coefficient of lift (interpolated): "
         << interpolate(request, angle, coef) << endl;
  /* Exit program. */
  return 0;
}
/*-------------------------------------------------------------------
*/

/* This function interpolates y values, given x and a new value.
*/
/* It is assumed that x is in ascending order.
*/
double interpolate(double value, int x[], double y[]) {
  /* Declare variables. */
  int i = 0;
  /* Find the angles that value is between. */
  while (value > (double)x[i])
    i++;

  /* Return interpolated value. */
  if (value == (double)x[i])
    return y[i];
  else
    /* value is between x[i-1] and x[i] */
    return (y[i - 1] +
            (value - x[i - 1]) / (x[i] - x[i - 1]) * (y[i] - y[i - 1]));
}
