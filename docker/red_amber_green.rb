
lambda { |stdout,stderr,status|
  output = stdout + stderr
  junit_pattern = Regexp.new('^\[\s+(\d+) tests failed\s+\]')
  if match = junit_pattern.match(output)
    if match[1] == '0'
      return :green
    else
      return :red
    end
  else
    return :amber
  end
}
