# https://www.hackerrank.com/challenges/ruby-strings-iteration/problem

def count_multibyte_char str
  multibytes = str.each_char.select { |b| b.bytesize > 1}
  multibytes.count
end