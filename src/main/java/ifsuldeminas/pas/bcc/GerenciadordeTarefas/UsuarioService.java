package ifsuldeminas.pas.bcc.GerenciadordeTarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            return null;
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long id, Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuario.getNome());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setSenha(usuario.getSenha());
            return usuarioRepository.save(usuarioExistente);
        }
        return null;
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario loginUsuario(Usuario usuario) {
        Usuario usuarioAutenticado = usuarioRepository.findByEmail(usuario.getEmail());
    
        if (usuarioAutenticado != null && usuarioAutenticado.validarCredenciais(usuario.getEmail(), usuario.getSenha())) {
            return usuarioAutenticado;
        }
    
        return null;
    }

    public Usuario getUsuarioByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public String generateToken(Usuario usuario) {
        return jwtTokenProvider.generateToken(usuario); 
    }
}
