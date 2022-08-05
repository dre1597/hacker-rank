# https://www.hackerrank.com/challenges/ruby-strings-methods-ii/problem

def strike word
  "<strike>#{word}</strike>"
end

def mask_article text, words
  words.each do |word|
    text.gsub!(word, strike(word)) if text.include? word
  end
  
  text
end