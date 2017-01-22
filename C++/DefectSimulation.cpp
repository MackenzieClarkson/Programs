#include <cstdlib>
#include <iostream>
using namespace std;
const int SIMULATIONS = 5000;
const double REL12 = 0.8;
const double REL34 = 0.95;
const int MIN_REL = 0;
const int MAX_REL = 1;
// double rand_float(double a, double b);
double rand_float(double a, double b) {
  return ((double)rand() / RAND_MAX) * (b - a) + a;
}
int main() {
  /* Define variables. */
  int num_sim = 0, success = 0;
  double est1, est2, est3, est4;
  /* Run simulations. */
  for (num_sim = 0; num_sim < SIMULATIONS; num_sim++) {
    /* Get the random numbers. */
    est1 = rand_float(MIN_REL, MAX_REL);
    est2 = rand_float(MIN_REL, MAX_REL);
    est3 = rand_float(MIN_REL, MAX_REL);
    est4 = rand_float(MIN_REL, MAX_REL);
    /* Now test the configuration. */
    if (((est1 <= REL12) && (est2 <= REL12)) ||
        ((est3 <= REL34) && (est4 <= REL34)))
      success++;
  }
  /* Print results. */
  cout << "Simulation Reliability for " << num_sim << " trials:
                                                      "
       << (double)success / num_sim << endl;
  /* Exit program. */
  return 0;
}
