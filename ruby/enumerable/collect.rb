# https://www.hackerrank.com/challenges/ruby-enumerable-collect/problem

def rot13(secret_messages)
  secret_messages.map do |i|
    i.tr("n-za-m", "a-z")
  end
end