#! /usr/bin/python
# PE15 Starting in the top left corner of a 2x2 grid, there are 6 routes (without backtracking) to the bottom right corner.
# How many routes are there through a 20x20 grid?

def binom(n,k): return 1 if (k == 0) else n*binom(n-1,k-1)/k
x = binom(20+20, 20)
print(x)