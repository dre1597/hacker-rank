# https://www.hackerrank.com/challenges/ruby-hash-add-del-sel/problem

hackerrank.keep_if { |key,value| key.is_a? Integer }

hackerrank.delete_if { |key,value| value.even? }

hackerrank.store 543121, 100