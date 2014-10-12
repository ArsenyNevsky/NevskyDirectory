transpose ([]:_) = []
transpose matrix = map head matrix : transpose (map tail matrix)