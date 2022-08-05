# https://www.hackerrank.com/challenges/ruby-strings-indexing/problem

def serial_average str
  s = str[0,3]
  x = str[4,5]
  y = str[10,5]
  avg = ( x.to_f + y.to_f ) / 2
  "#{s}-#{avg.round(2)}"
end