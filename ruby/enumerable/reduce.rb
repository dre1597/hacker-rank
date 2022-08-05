# https://www.hackerrank.com/challenges/ruby-enumerable-reduce/problem

def sum_terms(n)
  (1..n).reduce(0) {|acc, curr| acc += (curr * curr + 1)}
end