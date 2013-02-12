#! /usr/bin/python
# PE15 Starting in the top left corner of a 2x2 grid, there are 6 routes (without backtracking) to the bottom right corner.
# How many routes are there through a 20x20 grid?


# it turns out, that this has a mathematical solution from combinatorics of n choose k where n = 20+20 (the 2 dimensions) and k is 20, one of the dimensions
#this uses the binomial coefficiant, where it is n!/((n-k)!k!)
# mathematically it can be made recursive, it takes the (n!/k!)*(1/(n-k)!) equation and slowly lowers it until the k reaches 0 

#recursive code for binomial coefficiant based on http://userpages.umbc.edu/~rcampbel/Computers/Python/probstat.html
def binom(n,k): return 1 if (k == 0) else n*binom(n-1,k-1)/k
x = binom(20+20, 20)
print(x)