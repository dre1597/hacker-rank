# https://www.hackerrank.com/challenges/ruby-strings-methods-i/problem

def process_text arr
  arr.map { |c| c.chomp.strip }.join ' '
end